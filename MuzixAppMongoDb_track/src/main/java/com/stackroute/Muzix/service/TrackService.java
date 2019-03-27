package com.stackroute.Muzix.service;

import com.stackroute.Muzix.domain.Track;
import com.stackroute.Muzix.exceptions.TrackAlreadyExistsException;
import com.stackroute.Muzix.exceptions.TrackNotFoundException;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.List;

@EnableEurekaClient
public interface TrackService {
    public Track saveTrack(Track track) throws TrackAlreadyExistsException;
    public List<Track> getAllTracks();
    public Track updateTrack(Track track);
    public Track findByName(String name);
            //throws TrackAlreadyExistsException;


    public Track deleteTrack(int trackId) throws TrackNotFoundException;

}

