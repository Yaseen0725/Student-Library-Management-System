package com.demo.example.Student_Library_Management_System.Converters;

import com.demo.example.Student_Library_Management_System.Models.Card;
import com.demo.example.Student_Library_Management_System.RequestDTOs.CardRequestDTO;

public class CardConverter {
    public static Card convertCardRequestDtoToCard(CardRequestDTO cardRequestDTO){
        Card card  = new Card();
        card.setCardStatus(cardRequestDTO.getCardStatus());
        return card;
    }
}
