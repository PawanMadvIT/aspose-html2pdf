package com.example.asposehtml2pdf;

import com.aspose.pdf.Document;
import com.aspose.pdf.HtmlLoadOptions;
import com.aspose.pdf.HtmlMediaType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class HtmlToPdfExportApplication {

    public static void main(String[] args) {
        SpringApplication.run(HtmlToPdfExportApplication.class, args);

        String sourceFile = "src/main/resources/input.html";
        Path documentPath = Paths.get("output.pdf");
        HtmlLoadOptions options = new HtmlLoadOptions();
        options.setHtmlMediaType(HtmlMediaType.Print);
        try (Document document = new Document(sourceFile, options)) {
            document.save(documentPath.toString());
        }
    }
}
