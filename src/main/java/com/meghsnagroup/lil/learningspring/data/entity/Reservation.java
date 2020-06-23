package com.meghsnagroup.lil.learningspring.data.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Reservation {
//    CREATE TABLE RESERVATION(
//            RESERVATION_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
//            ROOM_ID BIGINT NOT NULL,
//            GUEST_ID BIGINT NOT NULL,
//            RES_DATE DATE
//    );
    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;
    @Column(name = "ROOM_ID")
    private long roomId;
    @Column(name = "GUEST_ID")
    private long guestId;
    @Column(name = "RES_DATE")
    private Date resDate;

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }
    public Date getResDate() {
        return resDate;
    }

    public void setResDate(Date resDate) {
        this.resDate = resDate;
    }


}
