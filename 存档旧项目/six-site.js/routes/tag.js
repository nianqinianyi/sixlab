/*
 * Copyright (c) 1995 Sixlab. All rights reserved.
 *
 * Under the GPLv3(AKA GNU GENERAL PUBLIC LICENSE Version 3).
 * see http://www.gnu.org/licenses/gpl-3.0-standalone.html
 *
 * For more information, please see
 * http://sixlab.cn/
 */
/**
 *
 * @author 六楼的雨/loki
 * @since 1.0.0
 */
var express = require('express');
var router = express.Router();

router.get('/', index);
router.get('/:tagName', tag);

module.exports = router;

function index(req, res) {
    var username = req.cookies.six_username;
    if (username) {

    }
    res.render('index', {title: 'Test Express'});
};

function tag(req, res) {
    var username = req.cookies.six_username;
    if (username) {

    }
    res.render('index', {title: 'Test Express'});
};