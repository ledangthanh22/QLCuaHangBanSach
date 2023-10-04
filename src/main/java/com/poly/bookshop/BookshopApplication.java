package com.poly.bookshop;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Quan Ly Cua Hang Ban Sach",
                version = "1.0.0",
                description = "Xay dung webside ban sach nho !",
                termsOfService = "runcodenow",
                contact = @Contact(
                        name = "Thanh Lee",
                        email = "thanhld69@gmail.com"
                ),
                license = @License(
                        name = "Licence",
                        url = "runcodenow"
                )
        )
)

public class BookshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshopApplication.class, args);
    }

}
