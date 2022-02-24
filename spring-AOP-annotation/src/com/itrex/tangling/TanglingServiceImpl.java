package com.itrex.tangling;

/*
спутывание кода
 */
public class TanglingServiceImpl implements TanglingService {

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

    private static class SecurityContext {
        public static Object getPrincipal() {
            return new Object();
        }
    }

    private class Account {

    }

    private class AccessDeniedException extends Throwable {
    }
}

