/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hoss.jsf2demo;

import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.event.ActionEvent;

/**
 *
 * @author combathoss
 */
@Dependent
@ManagedBean(name = "logSearchActions")
public class LogSearchActions {
    
    @ManagedProperty(value="#{searchCriteria}")
    SearchCriteria searchCriteria;
    
    /**
     * Creates a new instance of LogSearchActions
     */
    public LogSearchActions() {
    }
    
    public void searchByCorrelationId(ActionEvent actionEvent) {
        System.out.println("You Pressed me");
        
        if (searchCriteria.getSource().length() == 0) {
            System.out.println("Source is empty");
        }
        if (searchCriteria.getTransactionId().length() == 0) {
            System.out.println("Transaction ID is empty");
        }
        if (searchCriteria.getCorrelationId().length() == 0) {
            System.out.println("Correlation ID is empty");
        }
        
        System.out.println("-->"+searchCriteria.getSearchDateTo().toString());
    }
     public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }
    
}
