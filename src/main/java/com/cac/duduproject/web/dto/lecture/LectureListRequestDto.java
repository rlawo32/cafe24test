package com.cac.duduproject.web.dto.lecture;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LectureListRequestDto {

    private Long institutionNo;
    private Long mainCategoryNo;
    private Long subCategoryNo;
    private String searchText;
    private List<divisionItemList> searchDivision;
    private Long searchState;

    @Data
    public static class divisionItemList {
        private String dvItem;
    }

}
