package com.scoutItOut.gameOfFifteen.repository;

import com.scoutItOut.gameOfFifteen.dao.BoardDAO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jasquier
 * @since 0.1
 */
public interface BoardRepository extends JpaRepository<BoardDAO, Long> {

}
