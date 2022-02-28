trigger AccountTrigger on Account(before insert, before update) {
    if(trigger.isbefore && (trigger.isInsert || trigger.isUpdate) {
        for(Account acc : trigger.new) {
             if(acc.copy_address__c = true) {
                acc.billingCity = acc.shippingCity;
                acc.billingCountry = acc.shippingCountry;
                acc.billingStreet = acc.shippingStreet;
             }
        }
       
    }
}
