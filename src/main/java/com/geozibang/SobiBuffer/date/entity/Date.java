package com.geozibang.SobiBuffer.date.entity;

import com.geozibang.SobiBuffer.date.dto.DateDto;
import com.geozibang.SobiBuffer.sobi.entity.Sobi;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="date")
public class Date {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DATE_ID")
    private Long id;

    @Column(name = "YEAR")
    private Long year;

    @Column(name = "MONTH")
    private Long month;

    @Column(name = "DAY")
    private Long day;

//    @OneToMany(mappedBy = "date", cascade = CascadeType.ALL)
//    private List<Sobi> sobiList;

    @Builder
    public Date(Long id, Long year, Long month, Long day){
        this.id = id;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public DateDto toDto(){
        return DateDto.builder()
                .id(this.id)
                .year(this.year)
                .month(this.month)
                .day(this.day)
                .build();
    }
}