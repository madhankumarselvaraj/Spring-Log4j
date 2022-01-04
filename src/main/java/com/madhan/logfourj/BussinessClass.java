/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.logfourj;

import org.apache.log4j.Logger;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class BussinessClass {

static Logger log = Logger.getLogger(MainApp.class.getName());

public void callBussinessClass() {
    log.info("Print logic");
}

public BussinessClass() {
    log.info("Bussiness Class Constructor");
}

}
