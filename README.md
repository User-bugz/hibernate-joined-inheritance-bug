# hibernate-joined-inheritance-bug
Hibernate Joined Inheritance with Discriminator column persistance bug.
Remove DiscriminatorColumn annotation from BaseEntity class and DiscriminatorValue annotation from DescendantEntity to persist correctly with JpaRepository or EntityManager.
Or remove jdbc.batch_size property. 
