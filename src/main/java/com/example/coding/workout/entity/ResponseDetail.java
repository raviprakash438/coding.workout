package com.example.coding.workout.entity;

public class ResponseDetail {
    private int page;
    private int total_page;
    private int per_page;
    private int total;
    private Author[] content;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_page() {
        return total_page;
    }

    public void setTotal_page(int total_page) {
        this.total_page = total_page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Author[] getContent() {
        return content;
    }

    public void setContent(Author[] content) {
        this.content = content;
    }


}
