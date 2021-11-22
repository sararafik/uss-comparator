package org.uss.supplier.model;

import java.util.Objects;

public class Supplier {

    private String response;

    public Supplier(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "response='" + response + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(response, supplier.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }
}
