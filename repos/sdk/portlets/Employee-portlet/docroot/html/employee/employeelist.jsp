<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.service.persistence.PortletUtil"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Criterion"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletClassLoaderUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.rknowsys.eapp.hrm.model.Employee"%>
<%@page import="com.rknowsys.eapp.hrm.service.EmployeeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="com.rknowsys.eapp.hrm.service.EmpSupervisorLocalServiceUtil"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.rknowsys.eapp.hrm.service.SubUnitLocalServiceUtil"%>
<%@page import="com.rknowsys.eapp.hrm.service.JobTitleLocalServiceUtil"%>
<%@page import="com.rknowsys.eapp.hrm.model.SubUnit"%>
<%@page import="com.rknowsys.eapp.hrm.model.JobTitle"%>
<%@page import="java.util.List"%>
<%@page
	import="com.rknowsys.eapp.hrm.service.EmploymentStatusLocalServiceUtil"%>
<%@page import="com.rknowsys.eapp.hrm.model.EmploymentStatus"%>
<%@page import="com.rknowsys.eapp.hrm.model.Nationality"%>
<%@page
	import="com.rknowsys.eapp.hrm.service.EmpDetailsLocalServiceUtil"%>
<%@page import="com.rknowsys.eapp.hrm.model.EmpDetails"%>
<%@page
	import="com.rknowsys.eapp.hrm.service.EmpPersonalDetailsLocalServiceUtil"%>
<%@page import="com.rknowsys.eapp.hrm.model.EmpPersonalDetails"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>
<theme:defineObjects />
<portlet:defineObjects />
<liferay-portlet:renderURL varImpl="employeeSearchURL">
	<portlet:param name="mvcPath" value="/html/employee/employeelist.jsp" />
</liferay-portlet:renderURL>
<portlet:renderURL var="addNewEmployee">
	<portlet:param name="mvcPath" value="/html/employee/add_employee.jsp" />
</portlet:renderURL>
<%	
long pageid=0;
pageid=PortalUtil.getPlidFromPortletId(themeDisplay.getLayout().getGroup().getGroupId(), "addemployee_WAR_Employeeportlet");
PortletURL myaccountURL = PortletURLFactoryUtil.create(renderRequest, 
		"addemployee_WAR_Employeeportlet",pageid, PortletRequest.RENDER_PHASE);
     myaccountURL.setWindowState(WindowState.MAXIMIZED);
%>
	<%!public String getSupervisorName(long id) {
		String supervisorName = "";
		if (id >= 0) {
			EmpPersonalDetails empSupervisor2 = null;
			DynamicQuery userQuery = null;
			try {
				userQuery = DynamicQueryFactoryUtil.forClass(
						EmpPersonalDetails.class,
						PortletClassLoaderUtil.getClassLoader());
				Criterion criterion = RestrictionsFactoryUtil.eq("employeeId",
						id);
				;
				userQuery.add(criterion);

				List<EmpPersonalDetails> userList = EmpPersonalDetailsLocalServiceUtil
						.dynamicQuery(userQuery);
				if(userList.size()!=0)
				{
				empSupervisor2 = userList.get(0);
				}
			} catch (SystemException e) {

			}

			if (empSupervisor2 != null) {
				supervisorName = empSupervisor2.getFirstName();
			} else {
				supervisorName = "";
			}

		}
		return supervisorName;
	}%>
	<aui:form action="<%=employeeSearchURL %>" method="get"
		name="proposalForm">
		<div class="employee-search">
		<div class="row-fluid">
			<div class="span4">
				<aui:input name="firstName" label="01_emp-name" inlineLabel="left"></aui:input>

			</div>
			<div class="span4">
				<aui:input name="employeeNo" label="01_id"></aui:input>
			</div>
			<div class="span4">
					<%-- <aui:input name="" label="Employment Status"></aui:input> --%>

					<aui:select name="employmentstatus" label="01_emp-status">
						<aui:option value="" selected="true">--select--</aui:option>
						<%
                        List<EmploymentStatus> empstatuslist = EmploymentStatusLocalServiceUtil.getEmploymentStatuses(-1, -1);
                                    Iterator empstatus = empstatuslist.iterator();
                                    while (empstatus.hasNext()) {
                                        EmploymentStatus empstatus2 = (EmploymentStatus) empstatus.next();
                        %>
						<aui:option value="<%=empstatus2.getEmploymentstatus()%>"><%=empstatus2.getEmploymentstatus()%></aui:option>
						<%
                            }
                        %>
					</aui:select>
			</div>
		</div>
		<div class="row-fluid">
			<div class="span4">
				<aui:input name="supervisorname" label="01_sup-name"
					id="supervisorname" />
			</div>
			<div class="span4">

				<aui:select name="jobtitle001" label="01_jobtitle">
					<aui:option value="" selected="true">--select--</aui:option>
					<%
                       List<JobTitle> jobtitlelist = JobTitleLocalServiceUtil.getJobTitles(-1,-1);
                                   Iterator jobtitle = jobtitlelist.iterator();
                                   while (jobtitle.hasNext()) {
                                       JobTitle jobtitle2 = (JobTitle) jobtitle.next();
                       %>
					<aui:option value="<%=jobtitle2.getTitle()%>"><%=jobtitle2.getTitle()%></aui:option>
					<%
                           }
                       %>
				</aui:select>


			</div>
			<div class="span4">

				<aui:select name="subunit" label="01_sub-unit">
					<aui:option value="" selected="true">--select--</aui:option>
					<%
                       List<SubUnit> subunitlist =  SubUnitLocalServiceUtil.getSubUnits(-1, -1);
                                   Iterator subunit = subunitlist.iterator();
                                   while (subunit.hasNext()) {
                                       SubUnit subunit2 = (SubUnit) subunit.next();
                       %>
					<aui:option value="<%=subunit2.getName()%>"><%=subunit2.getName()%></aui:option>
					<%
                           }
                       %>
				</aui:select>

			</div>
		</div>

		<div class="row-fluid">
			<div class="span12">
				<div class="control-group">
					<div class="controls">
						<aui:button type="submit" id="toggleColor" value="search"
							cssClass="btn btn-success" />
						<aui:button type="reset" id="" value="reset"
							cssClass="btn btn-danger" />
						<aui:a href="<%=myaccountURL.toString()%>"
							cssClass="btn button btn-success">Add</aui:a>
					</div>
				</div>
			</div>
		</div>
	</div>
		<liferay-portlet:renderURLParams varImpl="employeeSearchURL" />
		<liferay-portlet:renderURL varImpl="iteratorURL">
			<portlet:param name="mvcPath" value="/html/employee/employeelist.jsp" />
		</liferay-portlet:renderURL>
		<%!
  com.liferay.portal.kernel.dao.search.SearchContainer<EmpDetails> searchContainer;
%>

		<liferay-ui:search-container delta="5"
			displayTerms='<%= new DisplayTerms(renderRequest) %>'
			emptyResultsMessage="no-records-available-for-employee"
			deltaConfigurable="true" iteratorURL="<%=iteratorURL%>">
			<liferay-ui:search-container-results>
				<%
		long layoutGroupId=themeDisplay.getLayout().getGroup().getGroupId();
		DisplayTerms displayTerms =searchContainer.getDisplayTerms();
		String empname = ParamUtil.getString(renderRequest, "firstName");
		String empid = ParamUtil.getString(renderRequest, "employeeNo");
		String empstatus = ParamUtil.getString(renderRequest, "employmentstatus");
		String supervisorname = ParamUtil.getString(renderRequest, "supervisorname");
		String jobtitle = ParamUtil.getString(renderRequest, "jobtitle");
		String subunit = ParamUtil.getString(renderRequest, "subunit");
		System.out.println("before results....parameters.." +empname+ ", "+empid+", "+empstatus+", "+supervisorname+", "+jobtitle+", " +subunit);
		List<EmpDetails> employeeList=EmpDetailsLocalServiceUtil.findEmpDetails(empname, empid, empstatus, supervisorname, jobtitle, subunit, -1,-1);
		
		List<EmpDetails> empDetailsList=new ArrayList();
		Iterator<EmpDetails> i=employeeList.iterator();
		while(i.hasNext())
		{
			EmpDetails employee=i.next();
			System.out.println("==="+employee.getGroupId());
			System.out.println("==="+layoutGroupId);
			if(employee.getGroupId()==layoutGroupId)
				empDetailsList.add(employee);
		}
	    results=ListUtil.subList(empDetailsList, searchContainer.getStart(), searchContainer.getEnd());
		total = empDetailsList.size(); 
		System.out.println("===total is"+empDetailsList.size());
	  	pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
		%>
			</liferay-ui:search-container-results>
			<liferay-ui:search-container-row className="EmpDetails"
				modelVar="EmpDetails" rowVar="curRow" escapedModel="<%= true %>">
				<liferay-ui:search-container-column-text orderable="true"
					name="01_id" property="employeeNo" />
				<liferay-ui:search-container-column-text orderable="true"
					name="01_firstName" property="firstName" />
				<liferay-ui:search-container-column-text orderable="true"
					name="01_lastName" property="lastName" />
				<liferay-ui:search-container-column-text orderable="true"
					name="01_jobtitle" property="title" />
				<liferay-ui:search-container-column-text orderable="true"
					name="01_sub-unit" />
				<liferay-ui:search-container-column-text orderable="true"
					name="01_sup-name" value="<%=getSupervisorName(EmpDetails.getSupervisor()) %>" />
				<liferay-ui:search-container-column-text orderable="true"
					name="01_emp-status" property="employmentstatus" />
				<liferay-ui:search-container-column-jsp name="edit"
					path="/html/employee/editClick.jsp" />
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator />

		</liferay-ui:search-container>
	</aui:form>