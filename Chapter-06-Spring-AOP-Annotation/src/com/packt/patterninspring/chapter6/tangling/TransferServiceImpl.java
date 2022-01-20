package com.packt.patterninspring.chapter6.tangling;

//спутывание кода
public class TransferServiceImpl implements TransferService {

    public void transfer(Account a, Account b, Double amount) throws AccessDeniedException {
//Security concern start here
        if (!hasPermission(SecurityContext.getPrincipal())) {
            throw new AccessDeniedException();
        }
//Security concern end here
//Business logic start here
//        Account aAct = accountRepository.findByAccountId(a);
//        Account bAct = accountRepository.findByAccountId(b);
//        accountRepository.transferAmount(aAct, bAct, amount);
//TODO
    }

    private Boolean hasPermission(Object o) {
        return true;
    }

    private class Account {

    }

    private class AccessDeniedException extends Throwable {

    }

    private static class SecurityContext {

        public static Object getPrincipal() {
            return new Object();
        }

    }

}

