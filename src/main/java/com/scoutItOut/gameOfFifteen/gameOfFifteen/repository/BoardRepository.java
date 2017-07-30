package com.scoutItOut.gameOfFifteen.gameOfFifteen.repository;

import com.scoutItOut.gameOfFifteen.gameOfFifteen.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
