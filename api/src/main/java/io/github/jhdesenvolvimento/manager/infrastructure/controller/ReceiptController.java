package io.github.jhdesenvolvimento.manager.infrastructure.controller;

import io.github.jhdesenvolvimento.manager.domain.exception.ReceiptNotFoundException;
import io.github.jhdesenvolvimento.manager.domain.repository.IReceiptRepository;
import io.github.jhdesenvolvimento.manager.infrastructure.assembler.ReceiptModelAssembler;
import io.github.jhdesenvolvimento.manager.infrastructure.entity.Receipt;
import java.util.List;
import java.util.UUID;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiptController {

    private final ReceiptModelAssembler assembler;
    private final IReceiptRepository repository;

    public ReceiptController(@Autowired ReceiptModelAssembler assembler, @Autowired IReceiptRepository repository) {
        this.assembler = assembler;
        this.repository = repository;
    }

    @GetMapping("/receipts")
    public CollectionModel<EntityModel<Receipt>> all() {
        List<EntityModel<@NonNull Receipt>> receipts =
                this.repository.findAll().stream().map(this.assembler::toModel).toList();

        return CollectionModel.of(receipts);
    }

    @GetMapping("/receipts/{uuid}")
    public EntityModel<Receipt> getOne(@PathVariable UUID uuid) {
        return this.assembler.toModel(
                this.repository.findById(uuid).orElseThrow(() -> new ReceiptNotFoundException(uuid)));
    }

    @PostMapping("/receipts/")
    public EntityModel<Receipt> save(@RequestBody Receipt newReceipt) {
        return this.assembler.toModel(repository.save(newReceipt));
    }

    @PutMapping("/receipts/{uuid}")
    public EntityModel<Receipt> update(@RequestBody Receipt newReceipt, @PathVariable UUID uuid) {
        return null;
    }

    @DeleteMapping("/receipts/{uuid}")
    public void deleteReceipt(@PathVariable UUID uuid) {
        this.repository.deleteById(uuid);
    }
}
