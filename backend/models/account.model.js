const { DataTypes } = require('sequelize');
const getAccount = require('./database_models/Account');

class AccountModel {
    constructor(connection) {
        this.model = getAccount(connection, DataTypes);
    }

    getAccounts() {
        return this.model.findAll();
    }

    async login1(username, password) {
       const exist = await this.model.count({
           where: { username, password }
       });

       return exist ? true : false;
    }
    async login(username, password) {
        const exist = await this.model.findOne({
            where: { username, password }
        });
 
        return exist ? {username: exist.username, name: exist.name, token: exist.username} : false;
    }
}

module.exports = AccountModel;
