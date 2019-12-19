package Clases;

import Controladores.Usuario_Controller;
import Principal.Principal;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbFile;

public class Firmas {

    Usuario_Controller UC = new Usuario_Controller();

    public void firmar(String Ubicacion, String fecha, String hora) {
        try {
            String rutausuario = System.getProperty("user.home");
            PdfReader pdfReader = new PdfReader(Ubicacion);
            PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream(rutausuario + "/Desktop/Firma.pdf"));
            int phor;
            Chunk c, c2, c3, c4;
            Font f = new Font(Font.FontFamily.COURIER, 6, Font.BOLDITALIC, BaseColor.BLACK);
            switch (UC.area_usuario(Principal.lbluser.getText())) {
                case "Tecnología":
                    c = new Chunk("Gestión Area Tecnologia", f);
                    phor = 20;
                    break;
                case "Compras":
                    c = new Chunk("Gestión Area Compras", f);
                    phor = 20;
                    break;
                case "Capital Humano":
                    c = new Chunk("Gestión Area Capital Humano", f);
                    phor = 20;
                    break;
                case "Administrativo":
                    c = new Chunk("Aprobación Administrativo", f);
                    phor = 180;
                    break;
                default:
                    c = new Chunk("", f);
                    phor = 20;
                    break;
            }

            c2 = new Chunk("Usuario: " + UC.nombre_usuario(Principal.lbluser.getText()), f);
            c3 = new Chunk("Fecha: " + fecha + " Hora: " + hora, f);
            c4 = new Chunk("Aplicativo: Trébol v2.0", f);
            for (int i = 1; i <= pdfReader.getNumberOfPages(); i++) {
                c.setBackground(BaseColor.YELLOW);
                c2.setBackground(BaseColor.YELLOW);
                c3.setBackground(BaseColor.YELLOW);
                c4.setBackground(BaseColor.YELLOW);
                ColumnText.showTextAligned(pdfStamper.getOverContent(i), Element.ALIGN_BOTTOM, new Phrase(c), phor, 18, 0);
                ColumnText.showTextAligned(pdfStamper.getOverContent(i), Element.ALIGN_BOTTOM, new Phrase(c2), phor, 13, 0);
                ColumnText.showTextAligned(pdfStamper.getOverContent(i), Element.ALIGN_BOTTOM, new Phrase(c3), phor, 8, 0);
                ColumnText.showTextAligned(pdfStamper.getOverContent(i), Element.ALIGN_BOTTOM, new Phrase(c4), phor, 3, 0);
            }
            NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(null, "Soporte", "Rock2020");
            pdfStamper.close();
            pdfReader.close();
            Path origen = FileSystems.getDefault().getPath(rutausuario + "\\Desktop\\Firma.pdf");
            SmbFile destino = new SmbFile("smb:" + Ubicacion, auth);
            try (OutputStream out = destino.getOutputStream()) {
                Files.copy(origen, out);
                File doc = new File(origen.toString());
                doc.delete();
            }
        } catch (IOException | DocumentException ex) {
            Logger.getLogger(Firmas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void firmar_rev(String Ubicacion, String fecha, String hora) {
        try {
            String rutausuario = System.getProperty("user.home");
            PdfReader pdfReader = new PdfReader(Ubicacion);
            PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream(rutausuario + "/Desktop/Firma.pdf"));
            Chunk c, c2, c3, c4;
            Font f = new Font(Font.FontFamily.COURIER, 6, Font.BOLDITALIC, BaseColor.BLACK);
            c = new Chunk("Revisado por", f);
            c2 = new Chunk("Usuario: " + UC.nombre_usuario(Principal.lbluser.getText()), f);
            c3 = new Chunk("Fecha: " + fecha + " Hora: " + hora, f);
            c4 = new Chunk("Aplicativo: Trébol v2.0", f);
            for (int i = 1; i <= pdfReader.getNumberOfPages(); i++) {
                c.setBackground(BaseColor.YELLOW);
                c2.setBackground(BaseColor.YELLOW);
                c3.setBackground(BaseColor.YELLOW);
                c4.setBackground(BaseColor.YELLOW);
                ColumnText.showTextAligned(pdfStamper.getOverContent(i), Element.ALIGN_BOTTOM, new Phrase(c), 300, 18, 90);
                ColumnText.showTextAligned(pdfStamper.getOverContent(i), Element.ALIGN_BOTTOM, new Phrase(c2), 300, 13, 90);
                ColumnText.showTextAligned(pdfStamper.getOverContent(i), Element.ALIGN_BOTTOM, new Phrase(c3), 300, 8, 90);
                ColumnText.showTextAligned(pdfStamper.getOverContent(i), Element.ALIGN_BOTTOM, new Phrase(c4), 300, 3, 90);
            }
            NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(null, "Soporte", "Rock2020");
            pdfStamper.close();
            pdfReader.close();
            Path origen = FileSystems.getDefault().getPath(rutausuario + "\\Desktop\\Firma.pdf");
            SmbFile destino = new SmbFile("smb:" + Ubicacion, auth);
            try (OutputStream out = destino.getOutputStream()) {
                Files.copy(origen, out);
                File doc = new File(origen.toString());
                doc.delete();
            }
        } catch (IOException | DocumentException ex) {
            Logger.getLogger(Firmas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
