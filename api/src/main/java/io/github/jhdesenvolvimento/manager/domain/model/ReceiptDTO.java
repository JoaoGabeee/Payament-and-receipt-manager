/*
 * Copyright (c) 2026. Heber Ferreira Barra, João Gabriel de Cristo
 * Licensed under the Massachusetts Institute of Technology (MIT) License.
 * You may obtain a copy of the license at:
 *
 *     https://choosealicense.com/licenses/mit/
 *
 * A short and simple permissive license with conditions only requiring preservation of copyright and license notices.
 * Licensed works, modifications, and larger works may be distributed under different terms and without source code.
 *
 */

package io.github.jhdesenvolvimento.manager.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ReceiptDTO {

    public ReceiptDTO() {}

    public ReceiptDTO(
            UUID uuid, String name, boolean imageAttached, LocalDateTime dateTime, UUID senderUUID, UUID receiverUUID) {
        this.uuid = uuid;
        this.name = name;
        this.imageAttached = imageAttached;
        this.dateTime = dateTime;
        this.senderUUID = senderUUID;
        this.receiverUUID = receiverUUID;
    }

    private UUID uuid;
    private String name;
    private boolean imageAttached;
    private LocalDateTime dateTime;
    private UUID senderUUID;
    private UUID receiverUUID;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isImageAttached() {
        return imageAttached;
    }

    public void setImageAttached(boolean imageAttached) {
        this.imageAttached = imageAttached;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public UUID getSenderUUID() {
        return senderUUID;
    }

    public void setSenderUUID(UUID senderUUID) {
        this.senderUUID = senderUUID;
    }

    public UUID getReceiverUUID() {
        return receiverUUID;
    }

    public void setReceiverUUID(UUID recieverUUID) {
        this.receiverUUID = recieverUUID;
    }
}
