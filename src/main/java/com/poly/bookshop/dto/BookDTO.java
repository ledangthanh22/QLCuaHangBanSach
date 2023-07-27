package com.poly.bookshop.dto;

import com.poly.bookshop.entity.Author;
import com.poly.bookshop.entity.BookCover;
import com.poly.bookshop.entity.Category;
import com.poly.bookshop.entity.Publishing;
import com.poly.bookshop.entity.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class BookDTO {

    private String name;

    private String image;

    private Double price;

    private Integer quantity;

    private Boolean bookStatus;

    private String sizeName;

    private String categoryName;

    private String bookCoverName;

    private String publishingName;

    private String authorName;
}
