package com.f5Events.gametour.services;

import com.f5Events.gametour.repositories.EventGamesRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5Events.gametour.models.EventGames;

@Service
public class EventGamesService {
    
   EventGamesRepository  repository;

   @Autowired
   public EventGamesService(EventGamesRepository repository) {
       this.repository = repository;
   }

      public EventGames create(EventGames eventgames){
        EventGames eventgamesSaved = repository.save(eventgames);
       return eventgamesSaved;
   }

   public EventGames findById(Long id) {
    EventGames  eventGames =  repository.findById(id).orElseThrow();
       return eventGames;
   }

   public EventGames update(Long id, EventGames neweventgames){
       EventGames eventgamesold = repository.findById(id).orElseThrow();
       eventgamesold.setTitle(neweventgames.getTitle());
       eventgamesold.setPublicationevent(neweventgames.getPublicationevent());
       eventgamesold.setParticipants(neweventgames.getParticipants());
       eventgamesold.setLimitparticipants(neweventgames.getLimitparticipants());
       eventgamesold.setDescription(neweventgames.getDescription());
       eventgamesold.setImage(neweventgames.getImage());
       return repository.save(neweventgames);
   }
   
   public EventGames delete(Long id, EventGames eventgames1){
       eventgames1 = repository.findById(id).orElseThrow();
       repository.deleteById(eventgames1.getId());
       return eventgames1;
   }
   
   public List<EventGames> getAll() {
       List<EventGames> eventgames = repository.findAll();
       return eventgames;
   }




}
