package com.canvas.cheater.models;

import com.canvas.cheater.models.course_models.*;

import java.io.Serializable;

public class Course implements Serializable {
    private long id;
    private String sis_course_id;
    private String uuid;
    private long integration_id;
    private long sis_import_id;
    private String name;
    private String course_code;
    private String workflow_state;
    private long account_id;
    private long root_account_id;
    private long enrollment_term_id;
    private long grading_standard_id;
    private String created_at;
    private String start_at;
    private String end_at;
    private String locale;
    private Enrollment[] enrollments;
    private long total_students;
    private Calendar calendar;
    private String default_view;
    private String syllabus_body;
    private long needs_grading_count;
    private String term;
    private String course_progress;
    private boolean apply_assignment_group_weights;
    private Permission permissions;
    private boolean is_public;
    private boolean is_public_to_auth_users;
    private boolean public_syllabus;
    private boolean public_syllabus_to_auth;
    private String public_description;
    private long storage_quota_mb;
    private long storage_quota_used_mb;
    private boolean hide_final_grades;
    private String license;
    private boolean allow_student_assignment_edits;
    private boolean allow_wiki_comments;
    private boolean allow_student_forum_attachments;
    private boolean open_enrollment;
    private boolean self_enrollment;
    private boolean restrict_enrollments_to_course_dates;
    private String course_format;
    private boolean access_restricted_by_date;
    private String time_zone;
    private boolean blueprint;
    private BlueprintRestriction blueprint_restrictions;
    private BlueprintRestrictionByObjectType blueprint_restrictions_by_object_type;

    public long getId() { return id; }

    public void setId(long id) {
        this.id = id;
    }

    public String getSis_course_id() {
        return sis_course_id;
    }

    public void setSis_course_id(String sis_course_id) {
        this.sis_course_id = sis_course_id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getIntegration_id() {
        return integration_id;
    }

    public void setIntegration_id(long integration_id) {
        this.integration_id = integration_id;
    }

    public long getSis_import_id() {
        return sis_import_id;
    }

    public void setSis_import_id(long sis_import_id) {
        this.sis_import_id = sis_import_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getWorkflow_state() {
        return workflow_state;
    }

    public void setWorkflow_state(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(long account_id) {
        this.account_id = account_id;
    }

    public long getRoot_account_id() {
        return root_account_id;
    }

    public void setRoot_account_id(long root_account_id) {
        this.root_account_id = root_account_id;
    }

    public long getEnrollment_term_id() {
        return enrollment_term_id;
    }

    public void setEnrollment_term_id(long enrollment_term_id) {
        this.enrollment_term_id = enrollment_term_id;
    }

    public long getGrading_standard_id() {
        return grading_standard_id;
    }

    public void setGrading_standard_id(long grading_standard_id) {
        this.grading_standard_id = grading_standard_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getStart_at() {
        return start_at;
    }

    public void setStart_at(String start_at) {
        this.start_at = start_at;
    }

    public String getEnd_at() {
        return end_at;
    }

    public void setEnd_at(String end_at) {
        this.end_at = end_at;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Enrollment[] getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(Enrollment[] enrollments) {
        this.enrollments = enrollments;
    }

    public long getTotal_students() {
        return total_students;
    }

    public void setTotal_students(long total_students) {
        this.total_students = total_students;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getDefault_view() {
        return default_view;
    }

    public void setDefault_view(String default_view) {
        this.default_view = default_view;
    }

    public String getSyllabus_body() {
        return syllabus_body;
    }

    public void setSyllabus_body(String syllabus_body) {
        this.syllabus_body = syllabus_body;
    }

    public long getNeeds_grading_count() {
        return needs_grading_count;
    }

    public void setNeeds_grading_count(long needs_grading_count) {
        this.needs_grading_count = needs_grading_count;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getCourse_progress() {
        return course_progress;
    }

    public void setCourse_progress(String course_progress) {
        this.course_progress = course_progress;
    }

    public boolean isApply_assignment_group_weights() {
        return apply_assignment_group_weights;
    }

    public void setApply_assignment_group_weights(boolean apply_assignment_group_weights) {
        this.apply_assignment_group_weights = apply_assignment_group_weights;
    }

    public Permission getPermissions() {
        return permissions;
    }

    public void setPermissions(Permission permissions) {
        this.permissions = permissions;
    }

    public boolean isIs_public() {
        return is_public;
    }

    public void setIs_public(boolean is_public) {
        this.is_public = is_public;
    }

    public boolean isIs_public_to_auth_users() {
        return is_public_to_auth_users;
    }

    public void setIs_public_to_auth_users(boolean is_public_to_auth_users) {
        this.is_public_to_auth_users = is_public_to_auth_users;
    }

    public boolean isPublic_syllabus() {
        return public_syllabus;
    }

    public void setPublic_syllabus(boolean public_syllabus) {
        this.public_syllabus = public_syllabus;
    }

    public boolean isPublic_syllabus_to_auth() {
        return public_syllabus_to_auth;
    }

    public void setPublic_syllabus_to_auth(boolean public_syllabus_to_auth) {
        this.public_syllabus_to_auth = public_syllabus_to_auth;
    }

    public String getPublic_description() {
        return public_description;
    }

    public void setPublic_description(String public_description) {
        this.public_description = public_description;
    }

    public long getStorage_quota_mb() {
        return storage_quota_mb;
    }

    public void setStorage_quota_mb(long storage_quota_mb) {
        this.storage_quota_mb = storage_quota_mb;
    }

    public long getStorage_quota_used_mb() {
        return storage_quota_used_mb;
    }

    public void setStorage_quota_used_mb(long storage_quota_used_mb) {
        this.storage_quota_used_mb = storage_quota_used_mb;
    }

    public boolean isHide_final_grades() {
        return hide_final_grades;
    }

    public void setHide_final_grades(boolean hide_final_grades) {
        this.hide_final_grades = hide_final_grades;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public boolean isAllow_student_assignment_edits() {
        return allow_student_assignment_edits;
    }

    public void setAllow_student_assignment_edits(boolean allow_student_assignment_edits) {
        this.allow_student_assignment_edits = allow_student_assignment_edits;
    }

    public boolean isAllow_wiki_comments() {
        return allow_wiki_comments;
    }

    public void setAllow_wiki_comments(boolean allow_wiki_comments) {
        this.allow_wiki_comments = allow_wiki_comments;
    }

    public boolean isAllow_student_forum_attachments() {
        return allow_student_forum_attachments;
    }

    public void setAllow_student_forum_attachments(boolean allow_student_forum_attachments) {
        this.allow_student_forum_attachments = allow_student_forum_attachments;
    }

    public boolean isOpen_enrollment() {
        return open_enrollment;
    }

    public void setOpen_enrollment(boolean open_enrollment) {
        this.open_enrollment = open_enrollment;
    }

    public boolean isSelf_enrollment() {
        return self_enrollment;
    }

    public void setSelf_enrollment(boolean self_enrollment) {
        this.self_enrollment = self_enrollment;
    }

    public boolean isRestrict_enrollments_to_course_dates() {
        return restrict_enrollments_to_course_dates;
    }

    public void setRestrict_enrollments_to_course_dates(boolean restrict_enrollments_to_course_dates) {
        this.restrict_enrollments_to_course_dates = restrict_enrollments_to_course_dates;
    }

    public String getCourse_format() {
        return course_format;
    }

    public void setCourse_format(String course_format) {
        this.course_format = course_format;
    }

    public boolean isAccess_restricted_by_date() {
        return access_restricted_by_date;
    }

    public void setAccess_restricted_by_date(boolean access_restricted_by_date) {
        this.access_restricted_by_date = access_restricted_by_date;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public boolean isBlueprint() {
        return blueprint;
    }

    public void setBlueprint(boolean blueprint) {
        this.blueprint = blueprint;
    }

    public BlueprintRestriction getBlueprint_restrictions() {
        return blueprint_restrictions;
    }

    public void setBlueprint_restrictions(BlueprintRestriction blueprint_restrictions) {
        this.blueprint_restrictions = blueprint_restrictions;
    }

    public BlueprintRestrictionByObjectType getBlueprint_restrictions_by_object_type() {
        return blueprint_restrictions_by_object_type;
    }

    public void setBlueprint_restrictions_by_object_type(BlueprintRestrictionByObjectType blueprint_restrictions_by_object_type) {
        this.blueprint_restrictions_by_object_type = blueprint_restrictions_by_object_type;
    }
}
