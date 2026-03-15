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

package io.github.jhdesenvolvimento.receipt_manager_api.infrastructure.controller;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.jhdesenvolvimento.manager.Main;
import io.github.jhdesenvolvimento.manager.domain.model.ReceiptDTO;
import io.github.jhdesenvolvimento.manager.infrastructure.controller.ReceiptController;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {Main.class})
public class ReceiptControllerTest {

    private final ReceiptController controller;

    public ReceiptControllerTest(@Autowired ReceiptController controller) {
        this.controller = controller;
    }

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

    @Test
    void testSaveReceipt() {
        ReceiptDTO receiptDTO = new ReceiptDTO();
        receiptDTO.setUuid(UUID.randomUUID());
        receiptDTO.setName("Test");

        //        ReceiptDTO savedReceiptDTO = controller.save(receiptDTO);
        //        assertThat(savedReceiptDTO).isNotNull();
    }
}
