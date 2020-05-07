package com.example.feign.clients;

import com.example.feign.models.Mananger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@FeignClient("eurekaclientmicroservice")
public interface RestClient {

    @PostMapping("")
    public ResponseEntity<String> createMananger(@Valid @RequestBody Mananger mananger);

    @PatchMapping("/{mananger_id}")
    public ResponseEntity<String> patchManangerById(@PathVariable Integer mananger_id, @Valid @RequestBody Mananger mananger);

    @GetMapping("")
    public ResponseEntity<String> getAllManangers();

    @GetMapping("/{mananger_id}")
    public ResponseEntity<String> getManangerById(@PathVariable Integer mananger_id);

    @DeleteMapping("/{mananger_id}")
    public ResponseEntity<String> deleteMananger(@PathVariable Integer mananger_id);

}
