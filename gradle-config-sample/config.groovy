environments {
    development {
        jdbc {
            url = 'jdbc:mysql://localhost:3306/elf?autoReconnect=true'
            user = 'root'
            password = 'root'
            schemaNames='elf'
        }
    }
 
    test {
        jdbc {
            url = 'jdbc:mysql://10.67.2.28:3306/elf?autoReconnect=true'
            user = 'root'
            password = 'root'
            schemaNames='elf'
        }
    }
 
    production {
        jdbc {
            url = 'jdbc:mysql://localhost:3306/elf?autoReconnect=true'
            user = 'root'
            password = 'root'
            schemaNames='elf'
        }
    }
}