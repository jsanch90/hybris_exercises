package de.hybris.training.facades.myCreationDate;

import java.text.ParseException;

public interface MyCreationDateFacade {
    void setCreationDate(String creationDate, String productCode) throws ParseException;
}
