package com.codares.authservice.users.domain.services;

import com.codares.authservice.users.domain.model.entities.Role;
import com.codares.authservice.users.domain.model.queries.GetAllRolesQuery;
import com.codares.authservice.users.domain.model.queries.GetRoleByNameQuery;

import java.util.List;
import java.util.Optional;

public interface RoleQueryService {
  List<Role> handle(GetAllRolesQuery query);
  Optional<Role> handle(GetRoleByNameQuery query);
}
