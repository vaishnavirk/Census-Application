/**
 * 
 */
package com.sapient.resttraining.repository;

import java.util.*;

import org.springframework.data.jpa.repository.*;
import org.springframework.transaction.annotation.Transactional;

import com.sapient.resttraining.entity.Member;

/**
 * @author admi
 *
 */
public interface MemberRepository extends JpaRepository<Member, Integer> {

	Optional<List<Member>> findByFamilyId(String familyId);
//	@Query("select u from Member u where u.membername = ?1")
//	  Member findByMemberId(String emailAddress);
//	
	/**
	@Query("select u from User u where u.emailAddress = ?1")
	  User findByEmailAddress(String emailAddress);
**/
	
	@Transactional    
	@Modifying
	@Query(value="DELETE FROM Member WHERE family_id =?1 and first_name=?2",nativeQuery = true)
	public void deleteByFamilyIdAndFirstName(String familyId,String firstName);
}
