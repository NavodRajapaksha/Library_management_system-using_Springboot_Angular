CREATE TABLE books
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,

    title VARCHAR(255) NOT NULL,

    author VARCHAR(255) NOT NULL,

    genre VARCHAR(100),

    language VARCHAR(50),

    isbn VARCHAR(20) UNIQUE,

    status VARCHAR(20) NOT NULL,

    image_url VARCHAR(255),

    category_id BIGINT NOT NULL,

    CONSTRAINT fk_books_category
        FOREIGN KEY (category_id)
            REFERENCES categories(id)
);