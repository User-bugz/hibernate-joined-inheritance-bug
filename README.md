# hibernate-joined-inheritance-bug
Hibernate Joined Inheritance with Discriminator column persistance bug.
Entity saved partially: only to the base table. Descendant table is empty. 
"HHH000010: On release of batch it still contained JDBC statements" message issued after persisting.
Remove jdbc.batch_size property to persist correctly with JpaRepository or EntityManager.
