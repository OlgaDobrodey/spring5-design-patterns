package com.itrex.scattering;

/*
Разбрасывание кода означает, что один и тот же элемент функциональности разбросан по множеству
модулей приложения. Это способствует дублированию кода
таких элементов в модулях приложения
 */
public class ScatteringServiceImpl implements ScatteringService {
    public void transfer(Account a, Account b, Double amount) throws AccessDeniedException {
        //Security concern start here
        if (!hasPermission(SecurityContext.getPrincipal())) {
            throw new AccessDeniedException();
        }
        //Security concern end here
        //Business logic start here
    }

    private Boolean hasPermission(Object o) {
        return true;
    }

    private interface AccountService {
        void withdrawl(Account a, Double amount) throws AccessDeniedException;
    }

    private static class SecurityContext {
        public static Object getPrincipal() {
            return new Object();
        }
    }

    public class AccountServiceImpl implements AccountService {
        public void withdrawl(Account a, Double amount) throws AccessDeniedException {
            //Security concern start here
            if (!hasPermission(SecurityContext.getPrincipal())) {
                throw new AccessDeniedException();
            }
            //Security concern end here
            //Business logic start here
        }
    }

    private class Account {

    }

    private class AccessDeniedException extends Throwable {
    }

}


