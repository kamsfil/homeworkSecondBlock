package homework29.userClasses;

import homework29.classUtil.WorkingCollectionsUtil;

import java.time.LocalDateTime;
import java.util.*;

public class Document {

    private int numberDocument;
    private LocalDateTime dateCreation;
    private String name;

    private Random random = new Random();

    public Document() {
        this.numberDocument = random.nextInt(100);
        this.dateCreation = LocalDateTime.now();
        this.name = WorkingCollectionsUtil.randomName();
    }

    public Document(int numberDocument, LocalDateTime dateCreation, String name) {
        this.numberDocument = numberDocument;
        this.dateCreation = dateCreation;
        this.name = name;
    }

    public int getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(int numberDocument) {
        this.numberDocument = numberDocument;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Document{" +
                "numberDocument=" + numberDocument +
                ", dateCreation=" + dateCreation +
                ", name='" + name + '\'' +
                '}';
    }
}
