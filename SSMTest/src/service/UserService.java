package service;

import org.springframework.transaction.annotation.Transactional;


import dao.UserDAO;
import entity.User;

public class UserService {
	@Transactional
	public int addUser(User user) {
		/*SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserDAO userDao = sqlSession.getMapper(UserDAO.class);
		
		int rows = 0;
		try {
			rows = userDao.insert(user);
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
		return rows;*/
		
		int rows = userDao.insert(user);
		//int rows2 = logDao.insert(user.getName() + "注册了……");
		if (1==1) {
			throw new RuntimeException("我故意的，让事务回滚？！");
		}
		/*if (rows==1 && rows2==1) {
			
		}*/
		return 1; 
	}

	private UserDAO userDao;
	//private LogDAO logDao;
	public UserDAO getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	/*public LogDAO getLogDao() {
		return logDao;
	}
	public void setLogDao(LogDAO logDao) {
		this.logDao = logDao;
	}*/
}
