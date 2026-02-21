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

package io.github.jhdesenvolvimento.manager.domain.repository;

import io.github.jhdesenvolvimento.manager.infrastructure.entity.Profile;
import java.util.List;
import java.util.UUID;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfileRepository extends JpaRepository<@NonNull Profile, @NonNull UUID> {

    @Override
    @NonNull
    Profile getReferenceById(@NonNull UUID uuid);

    @Override
    @NullMarked
    List<Profile> findAll();
}
