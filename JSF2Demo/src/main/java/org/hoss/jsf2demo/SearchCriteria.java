/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hoss.jsf2demo;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


/**
 *
 * @author combathoss
 */
@ViewScoped
@ManagedBean(name = "searchCriteria")
public class SearchCriteria {

    private String correlationId;
    private String transactionId;
    private String source;
    private String target;
    private Date searchDateFrom;
    private Date searchDateTo;
    
    /**
     * Creates a new instance of SearchCriteria
     */
    public SearchCriteria() {
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Date getSearchDateFrom() {
        return searchDateFrom;
    }

    public void setSearchDateFrom(Date searchDateFrom) {
        this.searchDateFrom = searchDateFrom;
    }

    public Date getSearchDateTo() {
        return searchDateTo;
    }

    public void setSearchDateTo(Date searchDateTo) {
        this.searchDateTo = searchDateTo;
    }

   
}
