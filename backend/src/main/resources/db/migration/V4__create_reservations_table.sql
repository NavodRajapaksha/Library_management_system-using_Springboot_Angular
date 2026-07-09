CREATE TABLE reservations
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,

    user_id BIGINT NOT NULL,

    book_id BIGINT NOT NULL,

    reservation_date DATE NOT NULL,

    due_date DATE NOT NULL,

    returned_date DATE,

    status VARCHAR(20) NOT NULL,

    CONSTRAINT fk_reservation_user
        FOREIGN KEY (user_id)
            REFERENCES users(id),

    CONSTRAINT fk_reservation_book
        FOREIGN KEY (book_id)
            REFERENCES books(id)
);