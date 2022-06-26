package com.saybatan.interprobe.homework1.dao;

import com.saybatan.interprobe.homework1.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProductCommentDao extends JpaRepository<ProductComment, Long> {

    List<ProductComment> findAllByProduct_Id(Long id);

    List<ProductComment> findAllByUser_Id(Long id);

    List<ProductComment> findAllByUser_IdAndCommentDateIsBetween(Long userId, Date startDate, Date finishDate);

    List<ProductComment> findAllByProduct_IdAndCommentDateIsBetween(Long productId, Date startDate, Date finishDate);
}
