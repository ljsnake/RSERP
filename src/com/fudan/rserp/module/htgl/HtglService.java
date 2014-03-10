package com.fudan.rserp.module.htgl;

import com.fudan.rserp.config.model.TbErpContract;
import com.fudan.rserp.config.model.TbErpContractor;
import com.fudan.rserp.config.model.TbErpSubcontractor;
import com.fudan.rserp.util.PageSet;

public class HtglService {
	private HtglDao dao;
	
	public PageSet getFbdwList(PageSet ps, ListCondition lc){
		if(ps==null){
			ps = new PageSet();
		}
		ps = dao.getFbdwList(ps, lc);
		return ps;
	}
	public int addSubcontractor(TbErpSubcontractor subcontractor){
		if(subcontractor==null||subcontractor.getName()==null||"".equals(subcontractor.getName())){
			return 1;
		}
		if(dao.checkPropertyInEntityHasExist("TbErpSubcontractor", "name", subcontractor.getName())){
			return 2;
		}
		dao.saveOrUpdateObject(subcontractor);
		return 0;
	}
	public TbErpSubcontractor getSubcontractor(TbErpSubcontractor subcontractor){
		if(subcontractor!=null){
			subcontractor = (TbErpSubcontractor)dao.getObjectById(TbErpSubcontractor.class, subcontractor.getId());
		}
		return subcontractor;
	}
	public int updateSubcontractor(TbErpSubcontractor subcontractorVo){
		if(subcontractorVo==null||subcontractorVo.getName()==null||"".equals(subcontractorVo.getName())){
			return 1;
		}
		TbErpSubcontractor subcontractor = (TbErpSubcontractor)dao.getObjectById(TbErpSubcontractor.class, subcontractorVo.getId());
		if(subcontractor.getName()!=null && subcontractor.getName().equals(subcontractorVo.getName())){
			return 0;//未做修改.
		}
		if(dao.checkPropertyInEntityHasExist("TbErpSubcontractor", "name", subcontractorVo.getName())){
			return 2;
		}
		subcontractor.setName(subcontractorVo.getName());
		dao.saveOrUpdateObject(subcontractor);
		return 0;
	}
	public PageSet getZbdwList(PageSet ps, ListCondition lc){
		if(ps==null){
			ps = new PageSet();
		}
		ps = dao.getZbdwList(ps, lc);
		return ps;
	}
	public int addContractor(TbErpContractor contractor){
		if(contractor==null||contractor.getName()==null||"".equals(contractor.getName())){
			return 1;
		}
		dao.saveOrUpdateObject(contractor);
		return 0;
	}
	public TbErpContractor getContractor(TbErpContractor contractor){
		if(contractor!=null){
			contractor = (TbErpContractor)dao.getObjectById(TbErpContractor.class, contractor.getId());
		}
		return contractor;
	}
	public int updateContractor(TbErpContractor contractorVo){
		if(contractorVo==null||contractorVo.getName()==null||"".equals(contractorVo.getName())){
			return 1;
		}
		TbErpContractor contractor = (TbErpContractor)dao.getObjectById(TbErpContractor.class, contractorVo.getId());
		contractor.setName(contractorVo.getName());
		contractor.setAddress(contractorVo.getAddress());
		contractor.setContact(contractorVo.getContact());
		contractor.setPhone(contractorVo.getPhone());
		dao.saveOrUpdateObject(contractor);
		return 0;
	}
	public PageSet getHtList(PageSet ps, ListCondition lc){
		if(ps==null){
			ps = new PageSet();
		}
		ps = dao.getHtList(ps, lc);
		return ps;
	}
	public int addContract(TbErpContract contract){
		if(contract==null){
			return 1;
		}
		//FIXME
//		dao.saveOrUpdateObject(contract);
		return 0;
	}
	public TbErpContract getContract(TbErpContract contract){
		if(contract!=null){
			contract = (TbErpContract)dao.getObjectById(TbErpContract.class, contract.getId());
		}
		return contract;
	}
	public int updateContract(TbErpContract contractVo){
		//FIXME
		if(contractVo==null){
			return 1;
		}
//		TbErpContract contract = (TbErpContract)dao.getObjectById(TbErpContract.class, contractVo.getId());
//		contract.setName(contractVo.getName());
//		contract.setAddress(contractVo.getAddress());
//		contract.setContact(contractVo.getContact());
//		contract.setPhone(contractVo.getPhone());
//		dao.saveOrUpdateObject(contract);
		return 0;
	}
	
	public HtglDao getDao() {
		return dao;
	}
	public void setDao(HtglDao dao) {
		this.dao = dao;
	}
	
}
