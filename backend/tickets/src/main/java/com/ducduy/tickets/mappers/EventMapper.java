package com.ducduy.tickets.mappers;

import com.ducduy.tickets.domain.CreateEventRequest;
import com.ducduy.tickets.domain.CreateTicketTypeRequest;
import com.ducduy.tickets.domain.dtos.CreateEventRequestDto;
import com.ducduy.tickets.domain.dtos.CreateEventResponseDto;
import com.ducduy.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.ducduy.tickets.domain.entities.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);

}
