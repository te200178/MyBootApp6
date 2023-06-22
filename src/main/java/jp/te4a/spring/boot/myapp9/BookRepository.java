package jp.te4a.spring.boot.myapp9;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
@Transactional
public interface BookRepository extends JpaRepository<BookBean, Integer> {
	
}



