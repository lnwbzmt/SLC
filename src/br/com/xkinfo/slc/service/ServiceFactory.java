package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.service.impl.CondominioService;
import br.com.xkinfo.slc.service.impl.UtilService;


public class ServiceFactory {

    private static final IUtilService utilService = new UtilService();

    public static IUtilService getUtilService() {
        return utilService;
    }
    private static final ICondominioService condominioService = new CondominioService();

    public static ICondominioService getCondominioService() {
        return condominioService;
    }
   }
