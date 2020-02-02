/*
 * Copyright (c) 2020. Payla E-Commercial Group
 */

package net.payla.webapp.notification;


public interface Notification {
    //todo queue implementation in order to manage message polling
    public void smsNotification(Message message);
    public void pushNotification(Message message);
    public void emailNotification(Message message);

    /**
     * via call center
     * @param message
     */
    public void callNotification(Message message);
}
