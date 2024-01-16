package com.cac.duduproject.jpa.repository.board;

import com.cac.duduproject.jpa.domain.board.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardRepositoryCustom {

    Page<Board> findBySearch(Long institutionNo, String searchCategory,
                             String searchText, Pageable pageable);
}
