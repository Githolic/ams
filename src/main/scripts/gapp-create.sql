
    create table additional_infos (
        id int4 not null,
        additional_field_name varchar(255),
        required varchar(255),
        additioanl_field_type varchar(255),
        application_id int4,
        primary key (id)
    );

    create table applications (
        id int4 not null,
        birth_date varchar(255),
        cin varchar(255),
        citizenship varchar(255),
        email varchar(255),
        first_name varchar(255),
        gender varchar(255),
        last_name varchar(255),
        phone varchar(255),
        gpa varchar(255),
        gre_score varchar(255),
        toefl_score varchar(255),
        transcript varchar(255),
        term varchar(255),
        department_id int4,
        program_id int4,
        user_id int4,
        primary key (id)
    );

    create table authorities (
        user_id int4 not null,
        usertype varchar(255)
    );

    create table degrees (
        id int4 not null,
        degree_name varchar(255),
        major varchar(255),
        time_attend varchar(255),
        university_name varchar(255),
        application_id int4,
        primary key (id)
    );

    create table departments (
        id int4 not null,
        department_name varchar(255),
        primary key (id)
    );

    create table programs (
        id int4 not null,
        program_name varchar(255),
        department_id int4,
        primary key (id)
    );

    create table users (
        id int4 not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        username varchar(255),
        primary key (id)
    );

    alter table additional_infos 
        add constraint FK_rj55lmcnl8d69rdj2cgip8n16 
        foreign key (application_id) 
        references applications;

    alter table applications 
        add constraint FK_78su0wnn02817h354falvtovc 
        foreign key (department_id) 
        references departments;

    alter table applications 
        add constraint FK_fvv8mt4q3l0jlgem0374rwfb5 
        foreign key (program_id) 
        references programs;

    alter table applications 
        add constraint FK_il296b7i4a8es7mgs2a79gl8o 
        foreign key (user_id) 
        references users;

    alter table authorities 
        add constraint FK_s21btj9mlob1djhm3amivbe5e 
        foreign key (user_id) 
        references users;

    alter table degrees 
        add constraint FK_rqi4wrhhtwwk6r9c9hcjyext9 
        foreign key (application_id) 
        references applications;

    alter table programs 
        add constraint FK_t38cee5jtiwtw07papp2rjlca 
        foreign key (department_id) 
        references departments;

    create sequence hibernate_sequence;




    insert into users (id, email, first_name, last_name, password, username) values
    (1, 'admin@localhost.localdomain', 'Stephen', 'Curry', 'abcd', 'admin');
    insert into users (id, email, first_name, last_name, password, username) values
    (2, 'staff1@localhost.localdomain', 'James', 'Harden', 'abcd', 'staff1');
    insert into users (id, email, first_name, last_name, password, username) values
    (3, 'staff2@localhost.localdomain', 'Lebron', 'James', 'abcd', 'staff2');
    insert into users (id, email, first_name, last_name, password, username) values
    (4, 'student1@localhost.localdomain', 'Anthony', 'Davis', 'abcd', 'student1');
    insert into users (id, email, first_name, last_name, password, username) values
    (5, 'student2@localhost.localdomain', 'Kevin', 'Durant', 'abcd', 'student2');
    
    insert into authorities values (1, 'ROLE_ADMIN');
    insert into authorities values (2, 'ROLE_STAFF');
    insert into authorities values (3, 'ROLE_STAFF');
    insert into authorities values (4, 'ROLE_STUDENT');
    insert into authorities values (5, 'ROLE_STUDENT');
    
    insert into departments values (1, 'Accounting');
    insert into departments values (2, 'Computer Science');
    
    insert into programs values (1, 'MS in Accounting', 1);
    insert into programs values (2, 'MS in Computer Science', 2);
    
    insert into applications values (1, '02/15/1985', '001', 'US', 'student1@localhost.localdomain', 'Anthony', 'Male', 'Davis', '6266777898', '3.5', '305', '88', 'transcript', 'Fall 2016', 1, 1, 4); 
    
    insert into degrees values (1, 'BS', 'Accounting', '09/26/2007', 'USC', 1);
    insert into degrees values (2, 'BS', 'Art History', '09/26/2007', 'USC', 1);
    
    insert into additional_infos values (1, 'GMAT', 'yes', '550',1);
