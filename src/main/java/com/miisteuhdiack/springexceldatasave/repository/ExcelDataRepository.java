package com.miisteuhdiack.springexceldatasave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface ExcelDataRepository<T> extends JpaRepository<T, UUID> {
}
