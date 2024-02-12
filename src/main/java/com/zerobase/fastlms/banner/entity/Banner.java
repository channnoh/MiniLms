package com.zerobase.fastlms.banner.entity;

import com.zerobase.fastlms.banner.type.TargetStatusType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String url;

    private Boolean isOpen;

    @Enumerated(EnumType.STRING)
    private TargetStatusType targetStatus;
    private int sortValue;

    private String fileName;
    private String urlFileName;

    private LocalDateTime regDt;
    private LocalDateTime udtDt;


}
