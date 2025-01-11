package org.example.lect6;

public enum Category {
    HISTORY("historyczna"),
    SCI_FI("science-fiction"),
    EDUCATIONAL("naukowa"),
    ACTION("akcji");

    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    Category(String categoryName) {
        this.categoryName = categoryName;
    }
}
