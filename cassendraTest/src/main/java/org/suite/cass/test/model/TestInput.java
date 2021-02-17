package org.suite.cass.test.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

public class TestInput implements Serializable {

	private UUID id;
    private String description;
    private BigDecimal price;
    
    
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
