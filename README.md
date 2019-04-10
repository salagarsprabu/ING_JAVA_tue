# ING Hackatho Demo


Query srcquery = em.createQuery("UPDATE UsersBalance SET balance = :srcBalance WHERE  user_id < :p");
srcquery.setParameter("srcBalance", src_bal);
srcquery.setParameter("p", srcBalance.getUserId());
srcquery.executeUpdate();

