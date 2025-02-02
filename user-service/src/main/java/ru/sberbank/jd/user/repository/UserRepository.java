package ru.sberbank.jd.user.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.sberbank.jd.user.model.UserInfo;

/**
 * Репозиторий данных пользователей.
 */
public interface UserRepository extends JpaRepository<UserInfo, UUID> {

    UserInfo findByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByPhoneNormalized(String phone);

    boolean existsByEmailAndIdNot(String email, UUID id);

    boolean existsByPhoneNormalizedAndIdNot(String phone, UUID id);
}
